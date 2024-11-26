import android.content.Context
import android.database.sqlite.SQLiteDatabase

class DatabaseHelper (context:Context?);
    SQLiteOpenHelper(context,DATABASE_NAME,factory:null,DATABASE_VERSION){
        companion object {
            const val DATABASE_VERSION=1
            private const val DATABASE_NAME="persons_db"
        }
    override fun onCreate(db:SQLiteDatabase.CREATE_TABLE)
    }
override fun
