package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.LPt8Fixed;

/* JADX INFO: loaded from: classes.dex */
public final class ir0 extends InputConnectionWrapper {
    public final TextView a;
    public final QnHx b;

    public static class QnHx {
        public static boolean a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            int iMin;
            Object obj = LPt8Fixed.i;
            if (editable == null || inputConnection == null || i < 0 || i2 < 0) {
                return false;
            }
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
                return false;
            }
            if (z) {
                int iMax = Math.max(i, 0);
                int length = editable.length();
                if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                    loop0: while (true) {
                        boolean z2 = false;
                        while (true) {
                            if (iMax == 0) {
                                break loop0;
                            }
                            selectionStart--;
                            if (selectionStart < 0) {
                                if (!z2) {
                                    selectionStart = 0;
                                    break loop0;
                                }
                                break;
                            }
                            char cCharAt = editable.charAt(selectionStart);
                            if (z2) {
                                if (Character.isHighSurrogate(cCharAt)) {
                                    iMax--;
                                }
                            } else if (!Character.isSurrogate(cCharAt)) {
                                iMax--;
                            } else if (!Character.isHighSurrogate(cCharAt)) {
                                z2 = true;
                            }
                            selectionStart = -1;
                            break;
                        }
                    }
                }
                selectionStart = -1;
                break;
                int iMax2 = Math.max(i2, 0);
                iMin = editable.length();
                if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                    loop2: while (true) {
                        boolean z3 = false;
                        while (true) {
                            if (iMax2 != 0) {
                                if (selectionEnd >= iMin) {
                                    if (!z3) {
                                        break loop2;
                                    }
                                    break loop2;
                                }
                                char cCharAt2 = editable.charAt(selectionEnd);
                                if (z3) {
                                    if (Character.isLowSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    }
                                } else if (!Character.isSurrogate(cCharAt2)) {
                                    iMax2--;
                                    selectionEnd++;
                                } else if (!Character.isLowSurrogate(cCharAt2)) {
                                    selectionEnd++;
                                    z3 = true;
                                }
                                iMin = -1;
                                break loop2;
                            }
                            iMin = selectionEnd;
                            break loop2;
                        }
                    }
                }
                iMin = -1;
                break loop2;
                if (selectionStart == -1 || iMin == -1) {
                    return false;
                }
            } else {
                selectionStart = Math.max(selectionStart - i, 0);
                iMin = Math.min(selectionEnd + i2, editable.length());
            }
            mr0[] mr0VarArr = (mr0[]) editable.getSpans(selectionStart, iMin, mr0.class);
            if (mr0VarArr == null || mr0VarArr.length <= 0) {
                return false;
            }
            for (mr0 mr0Var : mr0VarArr) {
                int spanStart = editable.getSpanStart(mr0Var);
                int spanEnd = editable.getSpanEnd(mr0Var);
                selectionStart = Math.min(spanStart, selectionStart);
                iMin = Math.max(spanEnd, iMin);
            }
            int iMax3 = Math.max(selectionStart, 0);
            int iMin2 = Math.min(iMin, editable.length());
            inputConnection.beginBatchEdit();
            editable.delete(iMax3, iMin2);
            inputConnection.endBatchEdit();
            return true;
        }
    }

    public ir0(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        QnHx qnHx = new QnHx();
        super(inputConnection, false);
        this.a = editText;
        this.b = qnHx;
        if (LPt8Fixed.j != null) {
            LPt8Fixed lPt8A = LPt8Fixed.a();
            if (!(lPt8A.b() == 1) || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            LPt8Fixed.QnHx qnHx2 = lPt8A.e;
            qnHx2.getClass();
            Bundle bundle = editorInfo.extras;
            de2 de2Var = qnHx2.c.a;
            int iA = de2Var.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? de2Var.b.getInt(iA + de2Var.a) : 0);
            Bundle bundle2 = editorInfo.extras;
            qnHx2.a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return QnHx.a(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return QnHx.a(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
