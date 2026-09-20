package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class fn5 extends at3.CQf {
    @Override // at3.CQf
    public final void a(r61 r61Var) {
        r61Var.b();
        try {
            int i = WorkDatabase.k;
            r61Var.e("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            r61Var.h();
        } finally {
            r61Var.c();
        }
    }
}
