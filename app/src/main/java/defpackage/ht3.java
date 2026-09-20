package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ht3 extends com5Fixed {
    public static final Parcelable.Creator<ht3> CREATOR = new tw5();
    public final int A;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public ht3(int i, int i2, int i3, boolean z, boolean z2) {
        this.w = i;
        this.x = z;
        this.y = z2;
        this.z = i2;
        this.A = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, this.w);
        Th.z(parcel, 2, this.x);
        Th.z(parcel, 3, this.y);
        Th.G(parcel, 4, this.z);
        Th.G(parcel, 5, this.A);
        Th.X(parcel, iP);
    }
}
