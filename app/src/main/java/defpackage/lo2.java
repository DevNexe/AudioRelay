package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class lo2 extends rs0 {
    public lo2(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    @Override // defpackage.rs0
    public final void a() {
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconOnClickListener(null);
        textInputLayout.setEndIconDrawable((Drawable) null);
        textInputLayout.setEndIconContentDescription((CharSequence) null);
    }
}
