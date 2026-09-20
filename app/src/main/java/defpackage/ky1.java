package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ky1 {
    public final Layout a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean[] d;
    public char[] e;

    public static final class QnHx {
        public final int a;
        public final int b;
        public final boolean c;

        public QnHx(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return false;
            }
            QnHx qnHx = (QnHx) obj;
            return this.a == qnHx.a && this.b == qnHx.b && this.c == qnHx.c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v4 */
        public final int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            boolean z = this.c;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return i + r1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.a);
            sb.append(", end=");
            sb.append(this.b);
            sb.append(", isRtl=");
            return dj.c(sb, this.c, ')');
        }
    }

    public ky1(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iE = mv4.E(this.a.getText(), '\n', length, false, 4);
            length = iE < 0 ? this.a.getText().length() : iE + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0189  */
    /* JADX WARN: Code duplicated, block: B:108:0x018d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0190  */
    /* JADX WARN: Code duplicated, block: B:159:0x0228  */
    /* JADX WARN: Code duplicated, block: B:161:0x0233  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    public final float a(int i, boolean z, boolean z2) {
        int lineForOffset;
        boolean z3;
        Bidi bidi;
        Bidi bidi2;
        char[] cArr;
        int i2;
        boolean z4;
        boolean z5;
        Layout layout = this.a;
        if (!z2) {
            return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
        }
        if (i <= 0) {
            lineForOffset = 0;
        } else if (i >= layout.getText().length()) {
            lineForOffset = layout.getLineCount() - 1;
        } else {
            lineForOffset = layout.getLineForOffset(i);
            int lineStart = layout.getLineStart(lineForOffset);
            int lineEnd = layout.getLineEnd(lineForOffset);
            if (lineStart == i || lineEnd == i) {
                if (lineStart == i) {
                    if (z2) {
                        lineForOffset--;
                    }
                } else if (!z2) {
                    lineForOffset++;
                }
            }
        }
        int lineStart2 = layout.getLineStart(lineForOffset);
        int lineEnd2 = layout.getLineEnd(lineForOffset);
        if (i != lineStart2 && i != lineEnd2) {
            return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
        }
        if (i == 0 || i == layout.getText().length()) {
            return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
        }
        ArrayList arrayList = this.b;
        int iM = ps0.m(arrayList, Integer.valueOf(i));
        int i3 = iM < 0 ? -(iM + 1) : iM + 1;
        if (z2 && i3 > 0) {
            int i4 = i3 - 1;
            if (i == ((Number) arrayList.get(i4)).intValue()) {
                i3 = i4;
            }
        }
        boolean z6 = layout.getParagraphDirection(layout.getLineForOffset(i3 == 0 ? 0 : ((Number) arrayList.get(i3 + (-1))).intValue())) == -1;
        while (lineEnd2 > 0) {
            int i5 = lineEnd2 - 1;
            char cCharAt = layout.getText().charAt(i5);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == 5760) {
                z5 = true;
            } else if (((8192 <= cCharAt && cCharAt < 8203) && cCharAt != 8199) || cCharAt == 8287 || cCharAt == 12288) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                break;
            }
            lineEnd2 = i5;
        }
        int iIntValue = i3 == 0 ? 0 : ((Number) arrayList.get(i3 - 1)).intValue();
        int i6 = lineStart2 - iIntValue;
        int i7 = lineEnd2 - iIntValue;
        boolean[] zArr = this.d;
        boolean z7 = zArr[i3];
        ArrayList arrayList2 = this.c;
        if (z7) {
            bidi2 = (Bidi) arrayList2.get(i3);
        } else {
            int iIntValue2 = i3 == 0 ? 0 : ((Number) arrayList.get(i3 - 1)).intValue();
            int iIntValue3 = ((Number) arrayList.get(i3)).intValue();
            int i8 = iIntValue3 - iIntValue2;
            char[] cArr2 = this.e;
            if (cArr2 == null || cArr2.length < i8) {
                cArr2 = new char[i8];
            }
            TextUtils.getChars(layout.getText(), iIntValue2, iIntValue3, cArr2, 0);
            if (Bidi.requiresBidi(cArr2, 0, i8)) {
                bidi = new Bidi(cArr2, 0, null, 0, i8, layout.getParagraphDirection(layout.getLineForOffset(i3 == 0 ? 0 : ((Number) arrayList.get(i3 + (-1))).intValue())) == -1 ? 1 : 0);
                z3 = true;
                if (bidi.getRunCount() == 1) {
                }
                arrayList2.set(i3, bidi);
                zArr[i3] = z3;
                if (bidi != null) {
                    cArr = this.e;
                    if (cArr2 == cArr) {
                        cArr2 = null;
                    } else {
                        cArr2 = cArr;
                    }
                }
                this.e = cArr2;
                bidi2 = bidi;
            } else {
                z3 = true;
            }
            bidi = null;
            arrayList2.set(i3, bidi);
            zArr[i3] = z3;
            if (bidi != null) {
                cArr = this.e;
                if (cArr2 == cArr) {
                    cArr2 = null;
                } else {
                    cArr2 = cArr;
                }
            }
            this.e = cArr2;
            bidi2 = bidi;
        }
        Bidi bidiCreateLineBidi = bidi2 != null ? bidi2.createLineBidi(i6, i7) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean z8 = z6;
            int i9 = lineForOffset;
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart2);
            if (z || z8 == zIsRtlCharAt) {
                z8 = !z8;
            }
            return i == lineStart2 ? z8 : !z8 ? layout.getLineLeft(i9) : layout.getLineRight(i9);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        QnHx[] qnHxArr = new QnHx[runCount];
        for (int i10 = 0; i10 < runCount; i10++) {
            qnHxArr[i10] = new QnHx(bidiCreateLineBidi.getRunStart(i10) + lineStart2, bidiCreateLineBidi.getRunLimit(i10) + lineStart2, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i11 = 0; i11 < runCount2; i11++) {
            bArr[i11] = (byte) bidiCreateLineBidi.getRunLevel(i11);
        }
        Bidi.reorderVisually(bArr, 0, qnHxArr, 0, runCount);
        if (i != lineStart2) {
            boolean z9 = z6;
            int i12 = lineForOffset;
            int i13 = 0;
            while (true) {
                if (i13 >= runCount) {
                    i2 = -1;
                    break;
                }
                if (qnHxArr[i13].b == i) {
                    i2 = i13;
                    break;
                }
                i13++;
            }
            QnHx qnHx = qnHxArr[i2];
            if (!z && z9 != qnHx.c) {
                z9 = !z9;
            }
            if (i2 == 0 && z9) {
                return layout.getLineLeft(i12);
            }
            if (i2 != runCount - 1 || z9) {
                return z9 ? layout.getPrimaryHorizontal(qnHxArr[i2 - 1].b) : layout.getPrimaryHorizontal(qnHxArr[i2 + 1].b);
            }
            return layout.getLineRight(i12);
        }
        int i14 = 0;
        while (true) {
            if (i14 >= runCount) {
                i14 = -1;
                break;
            }
            if (qnHxArr[i14].a == i) {
                break;
            }
            i14++;
        }
        QnHx qnHx2 = qnHxArr[i14];
        if (!z) {
            z4 = z6;
            if (z4 == qnHx2.c) {
            }
            if (i14 != 0 && z4) {
                return layout.getLineLeft(lineForOffset);
            }
            int i15 = lineForOffset;
            if (i14 == runCount - 1 || z4) {
                return z4 ? layout.getPrimaryHorizontal(qnHxArr[i14 - 1].a) : layout.getPrimaryHorizontal(qnHxArr[i14 + 1].a);
            }
            return layout.getLineRight(i15);
        }
        z4 = z6;
        z4 = !z4;
        if (i14 != 0) {
        }
        int i16 = lineForOffset;
        if (i14 == runCount - 1) {
        }
        if (z4) {
        }
    }
}
