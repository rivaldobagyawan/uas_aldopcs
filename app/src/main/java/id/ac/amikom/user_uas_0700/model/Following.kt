package id.ac.amikom.user_uas_0700.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Following(val avatar: String?,
                     val username: String?,
                     val id: Int?,
                     val type: String?
) : Parcelable
