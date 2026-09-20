package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class f37 implements Parcelable.Creator {
    public static void a(d37 d37Var, Parcel parcel) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, d37Var.w);
        Th.J(parcel, 2, d37Var.x);
        Th.H(parcel, 3, d37Var.y);
        Long l = d37Var.z;
        if (l != null) {
            parcel.writeInt(524292);
            parcel.writeLong(l.longValue());
        }
        Th.J(parcel, 6, d37Var.A);
        Th.J(parcel, 7, d37Var.B);
        Double d = d37Var.C;
        if (d != null) {
            parcel.writeInt(524296);
            parcel.writeDouble(d.doubleValue());
        }
        Th.X(parcel, iP);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        Long lValueOf = null;
        Float fValueOf = null;
        String strD2 = null;
        String strD3 = null;
        Double dValueOf = null;
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
                    jL = SafeParcelReader.l(parcel, i);
                    break;
                case 4:
                    int iM = SafeParcelReader.m(parcel, i);
                    if (iM != 0) {
                        SafeParcelReader.p(parcel, iM, 8);
                        lValueOf = Long.valueOf(parcel.readLong());
                    } else {
                        lValueOf = null;
                    }
                    break;
                case 5:
                    int iM2 = SafeParcelReader.m(parcel, i);
                    if (iM2 != 0) {
                        SafeParcelReader.p(parcel, iM2, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
                case 7:
                    strD3 = SafeParcelReader.d(parcel, i);
                    break;
                case '\b':
                    int iM3 = SafeParcelReader.m(parcel, i);
                    if (iM3 != 0) {
                        SafeParcelReader.p(parcel, iM3, 8);
                        dValueOf = Double.valueOf(parcel.readDouble());
                    } else {
                        dValueOf = null;
                    }
                    break;
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new d37(iK, strD, jL, lValueOf, fValueOf, strD2, strD3, dValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new d37[i];
    }
}
