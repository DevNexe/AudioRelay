package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.measurement.internal.zzec;
import com.google.android.gms.measurement.internal.zzee;

/* JADX INFO: loaded from: classes3.dex */
public final class nh6 extends QnHx {
    public nh6(Context context, Looper looper, s07 s07Var, s07 s07Var2) {
        super(context, looper, 93, s07Var, s07Var2);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof zzee ? (zzee) iInterfaceQueryLocalInterface : new zzec(iBinder);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String h() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String i() {
        return "com.google.android.gms.measurement.START";
    }
}
