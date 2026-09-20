package defpackage;

import android.telephony.TelephonyCallback;

/* JADX INFO: loaded from: classes.dex */
public final class l23 extends TelephonyCallback implements TelephonyCallback.CallStateListener {
    public final /* synthetic */ j81<f23, sd5> a;

    public l23(m23 m23Var) {
        this.a = m23Var;
    }

    public final void onCallStateChanged(int i) {
        this.a.invoke(new f23(i));
    }
}
