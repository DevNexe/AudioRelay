package defpackage;

import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zx0 implements ez {
    public final /* synthetic */ int w;

    public /* synthetic */ zx0(int i) {
        this.w = i;
    }

    @Override // defpackage.ez
    public final Object a(cq3 cq3Var) {
        switch (this.w) {
            case 0:
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(cq3Var);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(cq3Var);
        }
    }
}
