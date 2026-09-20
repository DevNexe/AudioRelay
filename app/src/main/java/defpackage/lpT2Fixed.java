package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class lpT2Fixed extends wnED {
    public static lpT2Fixed d;
    public BreakIterator c;

    public lpT2Fixed(Locale locale) {
        this.c = BreakIterator.getCharacterInstance(locale);
    }

    @Override // defpackage.bm88
    public final int[] a(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                ur1.e("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    ur1.e("impl");
                    throw null;
                }
                int iFollowing = breakIterator2.following(i);
                if (iFollowing == -1) {
                    return null;
                }
                return c(i, iFollowing);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                ur1.e("impl");
                throw null;
            }
            i = breakIterator3.following(i);
        } while (i != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.c;
            if (breakIterator == null) {
                ur1.e("impl");
                throw null;
            }
            if (breakIterator.isBoundary(i)) {
                BreakIterator breakIterator2 = this.c;
                if (breakIterator2 == null) {
                    ur1.e("impl");
                    throw null;
                }
                int iPreceding = breakIterator2.preceding(i);
                if (iPreceding == -1) {
                    return null;
                }
                return c(iPreceding, i);
            }
            BreakIterator breakIterator3 = this.c;
            if (breakIterator3 == null) {
                ur1.e("impl");
                throw null;
            }
            i = breakIterator3.preceding(i);
        } while (i != -1);
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
}
