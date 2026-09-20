package androidx.emoji2.text;

import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import defpackage.ce2;
import defpackage.lr0;
import defpackage.mr0;
import defpackage.ry2;
import defpackage.vy2;

/* JADX INFO: loaded from: classes.dex */
public final class YKK {
    public final LPt8Fixed.byN a;
    public final T23 b;
    public final LPt8Fixed.InterfaceC0023LPt8 c;

    public static final class QnHx {
        public int a = 1;
        public final T23.QnHx b;
        public T23.QnHx c;
        public T23.QnHx d;
        public int e;
        public int f;

        public QnHx(T23.QnHx qnHx) {
            this.b = qnHx;
            this.c = qnHx;
        }

        public final int a(int i) {
            SparseArray<T23.QnHx> sparseArray = this.c.a;
            T23.QnHx qnHx = sparseArray == null ? null : sparseArray.get(i);
            int i2 = 2;
            if (this.a != 2) {
                if (qnHx == null) {
                    b();
                    i2 = 1;
                } else {
                    this.a = 2;
                    this.c = qnHx;
                    this.f = 1;
                }
            } else if (qnHx != null) {
                this.c = qnHx;
                this.f++;
            } else {
                if (i == 65038) {
                    b();
                } else {
                    if (!(i == 65039)) {
                        T23.QnHx qnHx2 = this.c;
                        if (qnHx2.b != null) {
                            if (this.f != 1) {
                                this.d = qnHx2;
                                b();
                            } else if (c()) {
                                this.d = this.c;
                                b();
                            } else {
                                b();
                            }
                            i2 = 3;
                        } else {
                            b();
                        }
                    }
                }
                i2 = 1;
            }
            this.e = i;
            return i2;
        }

        public final void b() {
            this.a = 1;
            this.c = this.b;
            this.f = 0;
        }

        public final boolean c() {
            ce2 ce2VarC = this.c.b.c();
            int iA = ce2VarC.a(6);
            if ((iA == 0 || ce2VarC.b.get(iA + ce2VarC.a) == 0) ? false : true) {
                return true;
            }
            return this.e == 65039;
        }
    }

    public YKK(T23 t23, LPt8Fixed.byN byn, CQf cQf) {
        this.a = byn;
        this.b = t23;
        this.c = cQf;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        mr0[] mr0VarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (mr0VarArr = (mr0[]) editable.getSpans(selectionStart, selectionEnd, mr0.class)) != null && mr0VarArr.length > 0) {
            for (mr0 mr0Var : mr0VarArr) {
                int spanStart = editable.getSpanStart(mr0Var);
                int spanEnd = editable.getSpanEnd(mr0Var);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    public final boolean b(CharSequence charSequence, int i, int i2, lr0 lr0Var) {
        boolean zA;
        if (lr0Var.c == 0) {
            LPt8Fixed.InterfaceC0023LPt8 interfaceC0023LPt8 = this.c;
            ce2 ce2VarC = lr0Var.c();
            int iA = ce2VarC.a(8);
            short s = iA != 0 ? ce2VarC.b.getShort(iA + ce2VarC.a) : (short) 0;
            CQf cQf = (CQf) interfaceC0023LPt8;
            cQf.getClass();
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 23 || s <= i3) {
                ThreadLocal<StringBuilder> threadLocal = CQf.b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = threadLocal.get();
                sb.setLength(0);
                while (i < i2) {
                    sb.append(charSequence.charAt(i));
                    i++;
                }
                TextPaint textPaint = cQf.a;
                String string = sb.toString();
                ThreadLocal<vy2<Rect, Rect>> threadLocal2 = ry2.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    zA = ry2.QnHx.a(textPaint, string);
                } else {
                    int length = string.length();
                    if (length == 1 && Character.isWhitespace(string.charAt(0))) {
                        zA = true;
                    } else {
                        float fMeasureText = textPaint.measureText("\udfffd");
                        float fMeasureText2 = textPaint.measureText("m");
                        float fMeasureText3 = textPaint.measureText(string);
                        float fMeasureText4 = 0.0f;
                        if (fMeasureText3 != 0.0f) {
                            if (string.codePointCount(0, string.length()) > 1) {
                                if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                                    int i4 = 0;
                                    while (i4 < length) {
                                        int iCharCount = Character.charCount(string.codePointAt(i4)) + i4;
                                        fMeasureText4 += textPaint.measureText(string, i4, iCharCount);
                                        i4 = iCharCount;
                                    }
                                    if (fMeasureText3 >= fMeasureText4) {
                                    }
                                }
                                zA = false;
                            }
                            if (fMeasureText3 != fMeasureText) {
                                zA = true;
                            } else {
                                ThreadLocal<vy2<Rect, Rect>> threadLocal3 = ry2.a;
                                vy2<Rect, Rect> vy2Var = threadLocal3.get();
                                if (vy2Var == null) {
                                    vy2Var = new vy2<>(new Rect(), new Rect());
                                    threadLocal3.set(vy2Var);
                                } else {
                                    vy2Var.a.setEmpty();
                                    vy2Var.b.setEmpty();
                                }
                                Rect rect = vy2Var.a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                Rect rect2 = vy2Var.b;
                                textPaint.getTextBounds(string, 0, length, rect2);
                                zA = !rect.equals(rect2);
                            }
                        } else {
                            zA = false;
                        }
                    }
                }
            } else {
                zA = false;
            }
            lr0Var.c = zA ? 2 : 1;
        }
        return lr0Var.c == 2;
    }
}
