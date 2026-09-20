package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a47 extends k47 {
    public a47(int i) {
        super(i);
    }

    @Override // defpackage.k47
    public final void a() {
        if (!this.z) {
            for (int i = 0; i < this.x.size(); i++) {
                Map.Entry entry = (Map.Entry) this.x.get(i);
                if (((z07) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : this.y.isEmpty() ? g7.L : this.y.entrySet()) {
                if (((z07) entry2.getKey()).zzc()) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        super.a();
    }
}
