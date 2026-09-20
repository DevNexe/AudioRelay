package defpackage;

import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class gr0 {
    public final QnHx a;

    public static class CQf {
    }

    public static class QnHx extends CQf {
        public final EditText a;
        public final or0 b;

        public QnHx(EditText editText) {
            this.a = editText;
            or0 or0Var = new or0(editText);
            this.b = or0Var;
            editText.addTextChangedListener(or0Var);
            if (hr0.b == null) {
                synchronized (hr0.a) {
                    if (hr0.b == null) {
                        hr0.b = new hr0();
                    }
                }
            }
            editText.setEditableFactory(hr0.b);
        }
    }

    public gr0(EditText editText) {
        if (editText == null) {
            throw new NullPointerException("editText cannot be null");
        }
        this.a = new QnHx(editText);
    }
}
