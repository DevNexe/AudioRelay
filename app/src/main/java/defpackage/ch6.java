package defpackage;

import android.os.Message;
import com.google.android.gms.internal.ads.zzdm;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ch6 implements zzdm {
    public Message a;

    public ch6() {
    }

    public /* synthetic */ ch6(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdm
    public final void zza() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        this.a = null;
        ArrayList arrayList = hh6.b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }
}
