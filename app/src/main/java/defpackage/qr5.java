package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class qr5 implements Parcelable.Creator<pr5> {
    @Override // android.os.Parcelable.Creator
    public final pr5 createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        int iK = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iK2 = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iK = SafeParcelReader.k(parcel, i);
            } else if (c == 2) {
                account = (Account) SafeParcelReader.c(parcel, i, Account.CREATOR);
            } else if (c == 3) {
                iK2 = SafeParcelReader.k(parcel, i);
            } else if (c != 4) {
                SafeParcelReader.n(parcel, i);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.c(parcel, i, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new pr5(iK, account, iK2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ pr5[] newArray(int i) {
        return new pr5[i];
    }
}
