package defpackage;

import android.telephony.PhoneStateListener;

/* JADX INFO: loaded from: classes.dex */
public final class k23 extends PhoneStateListener {
    public final /* synthetic */ j81<f23, sd5> a;

    public k23(n23 n23Var) {
        this.a = n23Var;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        this.a.invoke(new f23(i));
    }
}
