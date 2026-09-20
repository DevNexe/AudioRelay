package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class nm extends qm {
    public final /* synthetic */ nn5 x;
    public final /* synthetic */ UUID y;

    public nm(nn5 nn5Var, UUID uuid) {
        this.x = nn5Var;
        this.y = uuid;
    }

    @Override // defpackage.qm
    public final void b() {
        nn5 nn5Var = this.x;
        WorkDatabase workDatabase = nn5Var.y;
        workDatabase.c();
        try {
            qm.a(nn5Var, this.y.toString());
            workDatabase.h();
            workDatabase.f();
            k54.a(nn5Var.x, nn5Var.y, nn5Var.A);
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
