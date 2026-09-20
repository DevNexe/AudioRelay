package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class da7 implements IqU {
    public final l87 a;
    public final u27 b;

    public da7(Context context) {
        u27 u27Var;
        this.a = new l87(context, oa1.b);
        synchronized (u27.class) {
            if (u27.c == null) {
                u27.c = new u27(context.getApplicationContext());
            }
            u27Var = u27.c;
        }
        this.b = u27Var;
    }

    @Override // defpackage.IqU
    public final w05<HB> a() {
        return this.a.a().h(new ta2(this, 10));
    }
}
