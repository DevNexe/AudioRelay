package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class an5 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    public static final class QnHx {
        public static boolean a(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public an5(CharSequence charSequence, int i, Locale locale) {
        this.a = charSequence;
        if (!(charSequence.length() >= 0)) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (!(i >= 0 && i <= charSequence.length())) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new qp(i, charSequence));
    }

    public final void a(int i) {
        boolean z = false;
        int i2 = this.b;
        int i3 = this.c;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(qc0.a(a42.a("Invalid offset: ", i, ". Valid range is [", i2, " , "), i3, ']').toString());
        }
    }

    public final boolean b(int i) {
        return (i <= this.c && this.b + 1 <= i) && Character.isLetterOrDigit(Character.codePointBefore(this.a, i));
    }

    public final boolean c(int i) {
        if (i <= this.c && this.b + 1 <= i) {
            return QnHx.a(Character.codePointBefore(this.a, i));
        }
        return false;
    }

    public final boolean d(int i) {
        return (i < this.c && this.b <= i) && Character.isLetterOrDigit(Character.codePointAt(this.a, i));
    }

    public final boolean e(int i) {
        if (i < this.c && this.b <= i) {
            return QnHx.a(Character.codePointAt(this.a, i));
        }
        return false;
    }
}
