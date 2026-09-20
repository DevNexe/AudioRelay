package defpackage;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class qq5 extends rq5 {
    public final /* synthetic */ Intent w;
    public final /* synthetic */ b32 x;

    public qq5(Intent intent, b32 b32Var) {
        this.w = intent;
        this.x = b32Var;
    }

    @Override // defpackage.rq5
    public final void a() {
        Intent intent = this.w;
        if (intent != null) {
            this.x.startActivityForResult(intent, 2);
        }
    }
}
