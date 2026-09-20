package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class uz6 extends com5Fixed {
    public static final Parcelable.Creator<uz6> CREATOR = new k17();
    public final Bundle w;
    public final tw0[] x;
    public final int y;
    public final d60 z;

    public uz6() {
    }

    public uz6(Bundle bundle, tw0[] tw0VarArr, int i, d60 d60Var) {
        this.w = bundle;
        this.x = tw0VarArr;
        this.y = i;
        this.z = d60Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.A(parcel, 1, this.w);
        Th.M(parcel, 2, this.x, i);
        Th.G(parcel, 3, this.y);
        Th.I(parcel, 4, this.z, i);
        Th.X(parcel, iP);
    }
}
