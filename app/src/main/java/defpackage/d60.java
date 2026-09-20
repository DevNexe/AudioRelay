package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d60 extends com5Fixed {
    public static final Parcelable.Creator<d60> CREATOR = new t27();
    public final int A;
    public final int[] B;
    public final ht3 w;
    public final boolean x;
    public final boolean y;
    public final int[] z;

    public d60(ht3 ht3Var, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.w = ht3Var;
        this.x = z;
        this.y = z2;
        this.z = iArr;
        this.A = i;
        this.B = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.I(parcel, 1, this.w, i);
        Th.z(parcel, 2, this.x);
        Th.z(parcel, 3, this.y);
        int[] iArr = this.z;
        if (iArr != null) {
            int iP2 = Th.P(parcel, 4);
            parcel.writeIntArray(iArr);
            Th.X(parcel, iP2);
        }
        Th.G(parcel, 5, this.A);
        int[] iArr2 = this.B;
        if (iArr2 != null) {
            int iP3 = Th.P(parcel, 6);
            parcel.writeIntArray(iArr2);
            Th.X(parcel, iP3);
        }
        Th.X(parcel, iP);
    }
}
