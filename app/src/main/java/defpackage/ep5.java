package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.F1;
import com.google.android.gms.common.api.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class ep5 extends QnHx.AbstractC0074QnHx<ik4, jk4> {
    @Override // com.google.android.gms.common.api.QnHx.AbstractC0074QnHx
    public final QnHx.NUlFixed b(Context context, Looper looper, os osVar, QnHx.F1 f1, F1.QnHx qnHx, F1.CQf cQf) {
        Integer num = osVar.i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", osVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new ik4(context, looper, osVar, bundle, qnHx, cQf);
    }
}
