package defpackage;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: loaded from: classes3.dex */
public final class la6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult w;

    public la6(JsPromptResult jsPromptResult) {
        this.w = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.w.cancel();
    }
}
