package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.F1;
import com.google.android.gms.internal.appset.zzg;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: loaded from: classes3.dex */
public final class ed6 extends F1<zzg> {
    public ed6(Context context, Looper looper, os osVar, v50 v50Var, lu2 lu2Var) {
        super(context, looper, RCHTTPStatusCodes.UNSUCCESSFUL, osVar, v50Var, lu2Var);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof zzg ? (zzg) iInterfaceQueryLocalInterface : new zzg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final tw0[] getApiFeatures() {
        return bg6.b;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String h() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String i() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final boolean usesClientTelemetry() {
        return true;
    }
}
