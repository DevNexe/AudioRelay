package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.YKK;

/* JADX INFO: loaded from: classes3.dex */
public final class zq5 extends com5Fixed {
    public static final Parcelable.Creator<zq5> CREATOR = new dr5();
    public final int w;
    public final z50 x;
    public final YKK y;

    public zq5(int i, z50 z50Var, YKK ykk) {
        this.w = i;
        this.x = z50Var;
        this.y = ykk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.I(parcel, 2, this.x, i);
        Th.I(parcel, 3, this.y, i);
        Th.X(parcel, iP);
    }
}
