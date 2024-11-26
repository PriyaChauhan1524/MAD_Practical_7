import android.adservices.adid.AdId
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.provider.ContactsContract.CommonDataKinds.SipAddress
import java.io.Serializable
class Person (
    var id:String,
    var name:String,
    var emailId: String,
    var phoneNo: String,
    var address: String,
    var latitude:Double,
    var longitude:Double):Serializable{}