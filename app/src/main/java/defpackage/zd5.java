package defpackage;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;

/* JADX INFO: loaded from: classes.dex */
public final class zd5 implements Spannable {
    public boolean w = false;
    public Spannable x;

    public static class CQf extends QnHx {
        @Override // zd5.QnHx
        public final boolean a(Spannable spannable) {
            return (spannable instanceof PrecomputedText) || (spannable instanceof na3);
        }
    }

    public static class QnHx {
        public boolean a(Spannable spannable) {
            return spannable instanceof na3;
        }
    }

    public zd5(Spannable spannable) {
        this.x = spannable;
    }

    public final void a() {
        Spannable spannable = this.x;
        if (!this.w) {
            if ((Build.VERSION.SDK_INT < 28 ? new QnHx() : new CQf()).a(spannable)) {
                this.x = new SpannableString(spannable);
            }
        }
        this.w = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.x.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return IntStream.VivifiedWrapper.convert(this.x.chars());
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return IntStream.VivifiedWrapper.convert(this.x.codePoints());
    }

    @Override // java.lang.CharSequence
    public final /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.x.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.x.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.x.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.x.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.x.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.x.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.x.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.x.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.x.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.x.toString();
    }

    public zd5(CharSequence charSequence) {
        this.x = new SpannableString(charSequence);
    }
}
