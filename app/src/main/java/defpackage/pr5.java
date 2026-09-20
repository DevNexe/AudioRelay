package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class pr5 extends com5Fixed {
    public static final Parcelable.Creator<pr5> CREATOR = new qr5();
    public final int w;
    public final Account x;
    public final int y;
    public final GoogleSignInAccount z;

    public pr5(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.w = i;
        this.x = account;
        this.y = i2;
        this.z = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.I(parcel, 2, this.x, i);
        Th.G(parcel, 3, this.y);
        Th.I(parcel, 4, this.z, i);
        Th.X(parcel, iP);
    }
}
