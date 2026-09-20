package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.api.QnHx;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ep2 implements QnHx.NUlFixed, ServiceConnection {
    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final Set<Scope> a() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final void connect(com.google.android.gms.common.internal.QnHx.F1 f1) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final void disconnect() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final void disconnect(String str) {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final tw0[] getAvailableFeatures() {
        return new tw0[0];
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final String getEndpointPackageName() {
        oa3.h(null);
        throw null;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final String getLastDisconnectMessage() {
        return null;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final boolean isConnected() {
        Thread.currentThread();
        throw null;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final boolean isConnecting() {
        Thread.currentThread();
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        throw null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        throw null;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final void onUserSignOut(com.google.android.gms.common.internal.QnHx.NUlFixed nUl) {
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.google.android.gms.common.api.QnHx.NUlFixed
    public final boolean requiresSignIn() {
        return false;
    }
}
