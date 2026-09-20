package defpackage;

import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class ee0 extends rs0 {
    public ee0(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // defpackage.rs0
    public final void a() {
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconOnClickListener(null);
        textInputLayout.setEndIconOnLongClickListener(null);
    }
}
