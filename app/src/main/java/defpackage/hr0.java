package defpackage;

import android.annotation.SuppressLint;
import android.text.Editable;

/* JADX INFO: loaded from: classes.dex */
public final class hr0 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile hr0 b;
    public static Class<?> c;

    @SuppressLint({"PrivateApi"})
    public hr0() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, hr0.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = c;
        return cls != null ? new uq4(cls, charSequence) : super.newEditable(charSequence);
    }
}
