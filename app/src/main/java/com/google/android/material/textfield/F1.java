package com.google.android.material.textfield;

import android.graphics.drawable.Drawable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.azefsw.audioconnect.R;
import defpackage.XTd3;
import defpackage.k65;
import defpackage.rs0;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class F1 extends rs0 {
    public final QnHx d;
    public final CQf e;
    public final C0085F1 f;

    public class CQf implements TextInputLayout.YKK {
        public CQf() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.YKK
        public final void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            F1 f1 = F1.this;
            f1.c.setChecked(true ^ F1.d(f1));
            QnHx qnHx = f1.d;
            editText.removeTextChangedListener(qnHx);
            editText.addTextChangedListener(qnHx);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.F1$F1, reason: collision with other inner class name */
    public class C0085F1 implements TextInputLayout.auxFixed {

        /* JADX INFO: renamed from: com.google.android.material.textfield.F1$F1$QnHx */
        public class QnHx implements Runnable {
            public final /* synthetic */ EditText w;

            public QnHx(EditText editText) {
                this.w = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.w.removeTextChangedListener(F1.this.d);
            }
        }

        public C0085F1() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.auxFixed
        public final void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new QnHx(editText));
        }
    }

    public class LPt8Fixed implements View.OnClickListener {
        public LPt8Fixed() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            F1 f1 = F1.this;
            EditText editText = f1.a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (F1.d(f1)) {
                editText.setTransformationMethod(null);
            } else {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            TextInputLayout textInputLayout = f1.a;
            textInputLayout.k(textInputLayout.D0, textInputLayout.F0);
        }
    }

    public class QnHx extends k65 {
        public QnHx() {
        }

        @Override // defpackage.k65, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            F1 f1 = F1.this;
            f1.c.setChecked(!F1.d(f1));
        }
    }

    public F1(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new QnHx();
        this.e = new CQf();
        this.f = new C0085F1();
    }

    public static boolean d(F1 f1) {
        EditText editText = f1.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // defpackage.rs0
    public final void a() {
        Drawable drawableL = XTd3.l(this.b, R.drawable.design_password_eye);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(drawableL);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.password_toggle_content_description));
        textInputLayout.setEndIconOnClickListener(new LPt8Fixed());
        LinkedHashSet<TextInputLayout.YKK> linkedHashSet = textInputLayout.A0;
        CQf cQf = this.e;
        linkedHashSet.add(cQf);
        if (textInputLayout.A != null) {
            cQf.a(textInputLayout);
        }
        textInputLayout.E0.add(this.f);
        EditText editText = textInputLayout.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
