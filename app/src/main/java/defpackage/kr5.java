package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.F1;
import com.google.android.gms.common.internal.service.zai;

/* JADX INFO: loaded from: classes.dex */
public final class kr5 extends F1<zai> {
    public final o15 G;

    public kr5(Context context, Looper looper, os osVar, o15 o15Var, v50 v50Var, lu2 lu2Var) {
        super(context, looper, 270, osVar, v50Var, lu2Var);
        this.G = o15Var;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof zai ? (zai) iInterfaceQueryLocalInterface : new zai(iBinder);
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final Bundle f() {
        o15 o15Var = this.G;
        o15Var.getClass();
        Bundle bundle = new Bundle();
        String str = o15Var.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final tw0[] getApiFeatures() {
        return mq5.b;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String h() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final String i() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.QnHx
    public final boolean j() {
        return true;
    }
}
