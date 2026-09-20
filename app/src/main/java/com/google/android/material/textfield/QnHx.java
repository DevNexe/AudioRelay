package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.azefsw.audioconnect.R;
import defpackage.XTd3;
import defpackage.cr;
import defpackage.dr;
import defpackage.er;
import defpackage.fr;
import defpackage.rs0;
import defpackage.ur;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx extends rs0 {
    public final C0087QnHx d;
    public final CQf e;
    public final F1 f;
    public final LPt8Fixed g;
    public AnimatorSet h;
    public ValueAnimator i;

    public class CQf implements View.OnFocusChangeListener {
        public CQf() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            QnHx.this.d((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
        }
    }

    public class F1 implements TextInputLayout.YKK {
        public F1() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        @Override // com.google.android.material.textfield.TextInputLayout.YKK
        public final void a(TextInputLayout textInputLayout) {
            boolean z;
            EditText editText = textInputLayout.getEditText();
            if (editText.hasFocus()) {
                z = editText.getText().length() > 0;
            }
            textInputLayout.setEndIconVisible(z);
            textInputLayout.setEndIconCheckable(false);
            QnHx qnHx = QnHx.this;
            editText.setOnFocusChangeListener(qnHx.e);
            C0087QnHx c0087QnHx = qnHx.d;
            editText.removeTextChangedListener(c0087QnHx);
            editText.addTextChangedListener(c0087QnHx);
        }
    }

    public class LPt8Fixed implements TextInputLayout.auxFixed {

        /* JADX INFO: renamed from: com.google.android.material.textfield.QnHx$LPt8$QnHx, reason: collision with other inner class name */
        public class RunnableC0086QnHx implements Runnable {
            public final /* synthetic */ EditText w;

            public RunnableC0086QnHx(EditText editText) {
                this.w = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.w.removeTextChangedListener(QnHx.this.d);
            }
        }

        public LPt8Fixed() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.auxFixed
        public final void a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i != 2) {
                return;
            }
            editText.post(new RunnableC0086QnHx(editText));
            if (editText.getOnFocusChangeListener() == QnHx.this.e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    public class NUlFixed implements View.OnClickListener {
        public NUlFixed() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            QnHx qnHx = QnHx.this;
            Editable text = qnHx.a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            TextInputLayout textInputLayout = qnHx.a;
            textInputLayout.k(textInputLayout.D0, textInputLayout.F0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.QnHx$QnHx, reason: collision with other inner class name */
    public class C0087QnHx implements TextWatcher {
        public C0087QnHx() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            QnHx qnHx = QnHx.this;
            if (qnHx.a.getSuffixText() != null) {
                return;
            }
            boolean z = false;
            if (qnHx.a.hasFocus()) {
                if (editable.length() > 0) {
                    z = true;
                }
            }
            qnHx.d(z);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public QnHx(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new C0087QnHx();
        this.e = new CQf();
        this.f = new F1();
        this.g = new LPt8Fixed();
    }

    @Override // defpackage.rs0
    public final void a() {
        Drawable drawableL = XTd3.l(this.b, R.drawable.mtrl_ic_cancel);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconDrawable(drawableL);
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.clear_text_end_icon_content_description));
        textInputLayout.setEndIconOnClickListener(new NUlFixed());
        LinkedHashSet<TextInputLayout.YKK> linkedHashSet = textInputLayout.A0;
        F1 f1 = this.f;
        linkedHashSet.add(f1);
        if (textInputLayout.A != null) {
            f1.a(textInputLayout);
        }
        textInputLayout.E0.add(this.g);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(ur.d);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new fr(this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = ur.a;
        valueAnimatorOfFloat2.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat2.setDuration(100L);
        valueAnimatorOfFloat2.addUpdateListener(new er(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.h = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.h.addListener(new cr(this));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(linearInterpolator);
        valueAnimatorOfFloat3.setDuration(100L);
        valueAnimatorOfFloat3.addUpdateListener(new er(this));
        this.i = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new dr(this));
    }

    @Override // defpackage.rs0
    public final void c(boolean z) {
        if (this.a.getSuffixText() == null) {
            return;
        }
        d(z);
    }

    public final void d(boolean z) {
        boolean z2 = this.a.g() == z;
        if (z && !this.h.isRunning()) {
            this.i.cancel();
            this.h.start();
            if (z2) {
                this.h.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.h.cancel();
        this.i.start();
        if (z2) {
            this.i.end();
        }
    }
}
