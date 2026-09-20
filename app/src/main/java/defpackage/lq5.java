package defpackage;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class lq5 extends rq5 {
    public final /* synthetic */ Intent w;
    public final /* synthetic */ Activity x;
    public final /* synthetic */ int y = 2;

    public lq5(Activity activity, Intent intent) {
        this.w = intent;
        this.x = activity;
    }

    @Override // defpackage.rq5
    public final void a() {
        Intent intent = this.w;
        if (intent != null) {
            this.x.startActivityForResult(intent, this.y);
        }
    }
}
