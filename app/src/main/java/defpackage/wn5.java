package defpackage;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.impl.model.WorkSpec;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class wn5 {
    public final UUID a;
    public final WorkSpec b;
    public final Set<String> c;

    public static abstract class QnHx<B extends QnHx<?, ?>, W extends wn5> {
        public UUID a;
        public WorkSpec b;
        public final HashSet c;

        public QnHx(Class<? extends ListenableWorker> cls) {
            HashSet hashSet = new HashSet();
            this.c = hashSet;
            this.a = UUID.randomUUID();
            this.b = new WorkSpec(this.a.toString(), cls.getName());
            hashSet.add(cls.getName());
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        public final dv2 a() {
            dv2 dv2Var = new dv2((dv2.QnHx) this);
            h70 h70Var = this.b.j;
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i >= 24) {
                if (!(h70Var.h.a.size() > 0)) {
                    if (!h70Var.d) {
                        z = false;
                    }
                }
            } else if (!h70Var.d && !h70Var.b && (i < 23 || !h70Var.c)) {
                z = false;
            }
            WorkSpec workSpec = this.b;
            if (workSpec.q) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (workSpec.g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.a = UUID.randomUUID();
            WorkSpec workSpec2 = new WorkSpec(this.b);
            this.b = workSpec2;
            workSpec2.a = this.a.toString();
            return dv2Var;
        }
    }

    public wn5(UUID uuid, WorkSpec workSpec, HashSet hashSet) {
        this.a = uuid;
        this.b = workSpec;
        this.c = hashSet;
    }
}
