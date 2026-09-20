package defpackage;

import com.google.android.gms.internal.ads.zzgod;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class yu6 extends fv6 {
    public yu6(int i) {
        super(i);
    }

    @Override // defpackage.fv6
    public final void a() {
        if (!this.z) {
            for (int i = 0; i < this.x.size(); i++) {
                Map.Entry entry = (Map.Entry) this.x.get(i);
                if (((zzgod) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : this.y.isEmpty() ? fp1.A : this.y.entrySet()) {
                if (((zzgod) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}
