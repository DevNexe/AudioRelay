package j$.time.format;

import java.text.ParsePosition;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
class m {
    protected String a;
    protected String b;
    protected char c;
    protected m d;
    protected m e;

    private m(String str, String str2, m mVar) {
        this.a = str;
        this.b = str2;
        this.d = mVar;
        this.c = str.length() == 0 ? (char) 65535 : this.a.charAt(0);
    }

    /* synthetic */ m(String str, String str2, m mVar, int i) {
        this(str, str2, mVar);
    }

    private boolean a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && b(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i != this.a.length()) {
            m mVarD = d(this.a.substring(i), this.b, this.d);
            this.a = str.substring(0, i);
            this.d = mVarD;
            if (i < str.length()) {
                this.d.e = d(str.substring(i), str2, null);
                this.b = null;
            } else {
                this.b = str2;
            }
            return true;
        }
        if (i >= str.length()) {
            this.b = str2;
            return true;
        }
        String strSubstring = str.substring(i);
        for (m mVar = this.d; mVar != null; mVar = mVar.e) {
            if (b(mVar.c, strSubstring.charAt(0))) {
                return mVar.a(strSubstring, str2);
            }
        }
        m mVarD2 = d(strSubstring, str2, null);
        mVarD2.e = this.d;
        this.d = mVarD2;
        return true;
    }

    public static m e(HashSet hashSet, s sVar) {
        m mVar = sVar.j() ? new m("", null, null) : new l();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            mVar.a(str, str);
        }
        return mVar;
    }

    protected boolean b(char c, char c2) {
        return c == c2;
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!f(charSequence, index, length)) {
            return null;
        }
        int length2 = this.a.length() + index;
        m mVar = this.d;
        if (mVar != null && length2 != length) {
            while (!b(mVar.c, charSequence.charAt(length2))) {
                mVar = mVar.e;
                if (mVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strC = mVar.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.b;
    }

    protected m d(String str, String str2, m mVar) {
        return new m(str, str2, mVar);
    }

    protected boolean f(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.a, i);
        }
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
