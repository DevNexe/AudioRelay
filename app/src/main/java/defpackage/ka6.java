package defpackage;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: loaded from: classes3.dex */
public final class ka6 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ JsPromptResult w;

    public ka6(JsPromptResult jsPromptResult) {
        this.w = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.w.cancel();
    }
}
