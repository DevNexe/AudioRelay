package defpackage;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: loaded from: classes3.dex */
public final class ma6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ JsPromptResult w;
    public final /* synthetic */ EditText x;

    public ma6(JsPromptResult jsPromptResult, EditText editText) {
        this.w = jsPromptResult;
        this.x = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.w.confirm(this.x.getText().toString());
    }
}
