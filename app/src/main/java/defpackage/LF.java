package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class LF extends wnED {
    public static LF d;
    public BreakIterator c;

    public LF(Locale locale) {
        this.c = BreakIterator.getWordInstance(locale);
    }

    @Override // defpackage.bm88
    public final int[] a(int i) {
        if (d().length() <= 0 || i >= d().length()) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (!g(i)) {
            if (g(i) && (i == 0 || !g(i + (-1)))) {
                break;
            }
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                ur1.e("impl");
                throw null;
            }
            i = breakIterator.following(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            ur1.e("impl");
            throw null;
        }
        int iFollowing = breakIterator2.following(i);
        if (iFollowing == -1 || !f(iFollowing)) {
            return null;
        }
        return c(i, iFollowing);
    }

    @Override // defpackage.bm88
    public final int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && !g(i - 1) && !f(i)) {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                ur1.e("impl");
                throw null;
            }
            i = breakIterator.preceding(i);
            if (i == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.c;
        if (breakIterator2 == null) {
            ur1.e("impl");
            throw null;
        }
        int iPreceding = breakIterator2.preceding(i);
        if (iPreceding != -1) {
            if (g(iPreceding) && (iPreceding == 0 || !g(iPreceding + (-1)))) {
                return c(iPreceding, i);
            }
        }
        return null;
    }

    public final void e(String str) {
        this.a = str;
        BreakIterator breakIterator = this.c;
        if (breakIterator != null) {
            breakIterator.setText(str);
        } else {
            ur1.e("impl");
            throw null;
        }
    }

    public final boolean f(int i) {
        return i > 0 && g(i + (-1)) && (i == d().length() || !g(i));
    }

    public final boolean g(int i) {
        if (i < 0 || i >= d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(d().codePointAt(i));
    }
}
