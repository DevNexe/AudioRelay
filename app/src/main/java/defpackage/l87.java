package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.CQf;
import com.google.android.gms.common.api.QnHx;
import com.google.android.gms.common.api.Status;
import defpackage.ed6;
import defpackage.h76;
import defpackage.tr5;
import defpackage.z05;

/* JADX INFO: loaded from: classes3.dex */
public final class l87 extends CQf<QnHx.F1.C0072F1> implements IqU {
    public static final QnHx<QnHx.F1.C0072F1> k = new QnHx<>("AppSet.API", new k57(), new QnHx.YKK());
    public final Context i;
    public final oa1 j;

    public l87(Context context, oa1 oa1Var) {
        super(context, k, QnHx.F1.a, CQf.QnHx.b);
        this.i = context;
        this.j = oa1Var;
    }

    @Override // defpackage.IqU
    public final w05<HB> a() {
        if (this.j.c(this.i, 212800000) != 0) {
            return k15.d(new ApiException(new Status(17, null)));
        }
        y05.QnHx qnHx = new y05.QnHx();
        qnHx.c = new tw0[]{bg6.a};
        qnHx.a = new em3(this) { // from class: com.google.android.gms.internal.appset.QnHx
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.em3
            public final void a(com.google.android.gms.common.api.QnHx.NUlFixed nUl, z05 z05Var) {
                zzg zzgVar = (zzg) ((ed6) nUl).getService();
                tr5 tr5Var = new tr5(null, null);
                zzo zzoVar = new zzo(z05Var);
                zzgVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
                int i = h76.a;
                parcelObtain.writeInt(1);
                tr5Var.writeToParcel(parcelObtain, 0);
                parcelObtain.writeStrongBinder(zzoVar);
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    zzgVar.w.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain.recycle();
                    parcelObtain2.recycle();
                }
            }
        };
        qnHx.b = false;
        qnHx.d = 27601;
        return c(0, new kq5(qnHx, qnHx.c, qnHx.b, qnHx.d));
    }
}
