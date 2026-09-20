package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes3.dex */
public final class a26 implements Parcelable.Creator {
    public static void a(m16 m16Var, Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.J(parcel, 2, m16Var.w);
        Th.I(parcel, 3, m16Var.x, i);
        Th.J(parcel, 4, m16Var.y);
        Th.H(parcel, 5, m16Var.z);
        Th.X(parcel, iP);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        String strD = null;
        o06 o06Var = null;
        String strD2 = null;
        long jL = 0;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strD = SafeParcelReader.d(parcel, i);
            } else if (c == 3) {
                o06Var = (o06) SafeParcelReader.c(parcel, i, o06.CREATOR);
            } else if (c == 4) {
                strD2 = SafeParcelReader.d(parcel, i);
            } else if (c != 5) {
                SafeParcelReader.n(parcel, i);
            } else {
                jL = SafeParcelReader.l(parcel, i);
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new m16(strD, o06Var, strD2, jL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new m16[i];
    }
}
