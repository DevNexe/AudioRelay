package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class np5 implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        String strD4 = null;
        Uri uri = null;
        String strD5 = null;
        String strD6 = null;
        ArrayList arrayList = null;
        String strD7 = null;
        String strD8 = null;
        long jL = 0;
        int iK = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 2:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 3:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case 4:
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case 5:
                    strD4 = SafeParcelReader.d(parcel, i);
                    break;
                case 6:
                    uri = (Uri) SafeParcelReader.c(parcel, i, Uri.CREATOR);
                    break;
                case 7:
                    strD5 = SafeParcelReader.d(parcel, i);
                    break;
                case '\b':
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case '\t':
                    strD6 = SafeParcelReader.d(parcel, i);
                    break;
                case '\n':
                    Parcelable.Creator<Scope> creator = Scope.CREATOR;
                    int iM = SafeParcelReader.m(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iM != 0) {
                        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
                        parcel.setDataPosition(iDataPosition + iM);
                        arrayList = arrayListCreateTypedArrayList;
                    } else {
                        arrayList = null;
                    }
                    break;
                case 11:
                    strD7 = SafeParcelReader.d(parcel, i);
                    break;
                case '\f':
                    strD8 = SafeParcelReader.d(parcel, i);
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new GoogleSignInAccount(iK, strD, strD2, strD3, strD4, uri, strD5, jL, strD6, arrayList, strD7, strD8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
