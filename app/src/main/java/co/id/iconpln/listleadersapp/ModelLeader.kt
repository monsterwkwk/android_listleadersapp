package co.id.iconpln.listleadersapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ModelLeader (
    var name: String = "",
    var desc: String = "",
    var country: String = "",
    var share: String = "",
    var photo: String = ""
): Parcelable