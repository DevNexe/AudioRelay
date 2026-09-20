package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.CQf;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class pm extends qm {
    public final /* synthetic */ nn5 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z = false;

    public pm(nn5 nn5Var, String str) {
        this.x = nn5Var;
        this.y = str;
    }

    @Override // defpackage.qm
    public final void b() {
        nn5 nn5Var = this.x;
        WorkDatabase workDatabase = nn5Var.y;
        workDatabase.c();
        try {
            Iterator it = ((CQf) workDatabase.n()).g(this.y).iterator();
            while (it.hasNext()) {
                qm.a(nn5Var, (String) it.next());
            }
            workDatabase.h();
            workDatabase.f();
            if (this.z) {
                k54.a(nn5Var.x, nn5Var.y, nn5Var.A);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
