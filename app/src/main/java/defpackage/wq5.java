package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class wq5 extends com5Fixed {
    public static final Parcelable.Creator<wq5> CREATOR = new yq5();
    public final int w;
    public final pr5 x;

    public wq5(int i, pr5 pr5Var) {
        this.w = i;
        this.x = pr5Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.I(parcel, 2, this.x, i);
        Th.X(parcel, iP);
    }
}
