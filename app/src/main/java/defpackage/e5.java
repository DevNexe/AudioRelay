package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e5 extends jj5 {
    public final UUID d;
    public i24 e;

    public e5(u24 u24Var) {
        UUID uuidRandomUUID = (UUID) u24Var.a.get("SaveableStateHolder_BackStackEntryKey");
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            u24Var.b(uuidRandomUUID, "SaveableStateHolder_BackStackEntryKey");
        }
        this.d = uuidRandomUUID;
    }

    @Override // defpackage.jj5
    public final void c() {
        i24 i24Var = this.e;
        if (i24Var != null) {
            i24Var.a(this.d);
        }
    }
}
