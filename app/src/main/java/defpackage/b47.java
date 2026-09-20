package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.CQf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class b47 implements Parcelable.Creator {
    public static void a(CQf cQf, Parcel parcel, int i) {
        int iP = Th.P(parcel, 20293);
        Th.G(parcel, 1, cQf.w);
        Th.G(parcel, 2, cQf.x);
        Th.G(parcel, 3, cQf.y);
        Th.J(parcel, 4, cQf.z);
        Th.F(parcel, 5, cQf.A);
        Th.M(parcel, 6, cQf.B, i);
        Th.A(parcel, 7, cQf.C);
        Th.I(parcel, 8, cQf.D, i);
        Th.M(parcel, 10, cQf.E, i);
        Th.M(parcel, 11, cQf.F, i);
        Th.z(parcel, 12, cQf.G);
        Th.G(parcel, 13, cQf.H);
        Th.z(parcel, 14, cQf.I);
        Th.J(parcel, 15, cQf.J);
        Th.X(parcel, iP);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = SafeParcelReader.o(parcel);
        Scope[] scopeArr = CQf.K;
        Bundle bundle = new Bundle();
        tw0[] tw0VarArr = CQf.L;
        tw0[] tw0VarArr2 = tw0VarArr;
        String strD = null;
        IBinder iBinderJ = null;
        Account account = null;
        String strD2 = null;
        int iK = 0;
        int iK2 = 0;
        int iK3 = 0;
        boolean zI = false;
        int iK4 = 0;
        boolean zI2 = false;
        while (parcel.dataPosition() < iO) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iK = SafeParcelReader.k(parcel, i);
                    break;
                case 2:
                    iK2 = SafeParcelReader.k(parcel, i);
                    break;
                case 3:
                    iK3 = SafeParcelReader.k(parcel, i);
                    break;
                case 4:
                    strD = SafeParcelReader.d(parcel, i);
                    break;
                case 5:
                    iBinderJ = SafeParcelReader.j(parcel, i);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.g(parcel, i, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, i);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.c(parcel, i, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.n(parcel, i);
                    break;
                case '\n':
                    tw0VarArr = (tw0[]) SafeParcelReader.g(parcel, i, tw0.CREATOR);
                    break;
                case 11:
                    tw0VarArr2 = (tw0[]) SafeParcelReader.g(parcel, i, tw0.CREATOR);
                    break;
                case '\f':
                    zI = SafeParcelReader.i(parcel, i);
                    break;
                case '\r':
                    iK4 = SafeParcelReader.k(parcel, i);
                    break;
                case 14:
                    zI2 = SafeParcelReader.i(parcel, i);
                    break;
                case 15:
                    strD2 = SafeParcelReader.d(parcel, i);
                    break;
            }
        }
        SafeParcelReader.h(parcel, iO);
        return new CQf(iK, iK2, iK3, strD, iBinderJ, scopeArr, bundle, account, tw0VarArr, tw0VarArr2, zI, iK4, zI2, strD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CQf[i];
    }
}
