package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ch2 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public int e = -1;
    public int f = -1;

    /* JADX WARN: Code duplicated, block: B:100:0x018d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0191  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x013a  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0143  */
    /* JADX WARN: Code duplicated, block: B:80:0x0147  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Code duplicated, block: B:84:0x0154  */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:90:0x0171  */
    /* JADX WARN: Code duplicated, block: B:93:0x017a  */
    /* JADX WARN: Code duplicated, block: B:95:0x017e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0184  */
    public final g93 a(MotionEvent motionEvent, ja3 ja3Var) {
        int i;
        boolean z;
        long jValueAt;
        long j;
        long jL;
        long jA;
        long jO;
        int toolType;
        int i2;
        ArrayList arrayList;
        int historySize;
        int i3;
        long jA2;
        float historicalX;
        float historicalY;
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked == 3) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.e || source != this.f) {
                this.e = toolType2;
                this.f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j2 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j3 = this.a;
                this.a = 1 + j3;
                sparseLongArray.put(pointerId, j3);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j4 = this.a;
                this.a = j4 + 1;
                sparseLongArray.put(pointerId2, j4);
            }
        }
        boolean z4 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z5 = actionMasked == 8;
        if (z4) {
            i = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i = 1;
        }
        int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i4 = 0;
        while (i4 < pointerCount) {
            boolean z6 = (z4 || i4 == actionIndex2 || (z5 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i4);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                long j5 = this.a;
                this.a = j5 + j2;
                sparseLongArray.put(pointerId3, j5);
                jValueAt = j5;
            }
            long jA3 = X.a(motionEvent.getX(i4), motionEvent.getY(i4));
            if (i4 == 0) {
                jA = X.a(motionEvent.getRawX(), motionEvent.getRawY());
                jO = ja3Var.o(jA);
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    jA = dh2.a.a(motionEvent, i4);
                    jO = ja3Var.o(jA);
                } else {
                    j = jA3;
                    jL = ja3Var.l(jA3);
                }
                toolType = motionEvent.getToolType(i4);
                if (toolType == 0) {
                    if (toolType != 1) {
                        i2 = 1;
                    } else if (toolType != 2) {
                        i2 = 3;
                    } else if (toolType != 3) {
                        i2 = 2;
                    } else if (toolType != 4) {
                        i2 = 4;
                    }
                    arrayList = new ArrayList();
                    i3 = 0;
                    for (historySize = motionEvent.getHistorySize(); i3 < historySize; historySize = historySize) {
                        historicalX = motionEvent.getHistoricalX(i4, i3);
                        historicalY = motionEvent.getHistoricalY(i4, i3);
                        if (!Float.isInfinite(historicalX) || Float.isNaN(historicalX)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            if (!Float.isInfinite(historicalY) || Float.isNaN(historicalY)) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                arrayList.add(new bd1(motionEvent.getHistoricalEventTime(i3), X.a(historicalX, historicalY)));
                            }
                        }
                        i3++;
                        actionIndex2 = actionIndex2;
                    }
                    int i5 = actionIndex2;
                    if (motionEvent.getActionMasked() == 8) {
                        jA2 = X.a(motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9));
                    } else {
                        jA2 = kt2.b;
                    }
                    h93 h93Var = new h93(jValueAt, motionEvent.getEventTime(), jL, j, z6, i2, sparseBooleanArray.get(motionEvent.getPointerId(i4), false), arrayList, jA2);
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(h93Var);
                    i4++;
                    arrayList2 = arrayList3;
                    actionIndex2 = i5;
                    z4 = z4;
                    j2 = 1;
                }
                i2 = 0;
                arrayList = new ArrayList();
                i3 = 0;
                while (i3 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i4, i3);
                    historicalY = motionEvent.getHistoricalY(i4, i3);
                    if (Float.isInfinite(historicalX)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (Float.isInfinite(historicalY)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            arrayList.add(new bd1(motionEvent.getHistoricalEventTime(i3), X.a(historicalX, historicalY)));
                        }
                    }
                    i3++;
                    actionIndex2 = actionIndex2;
                }
                int i6 = actionIndex2;
                if (motionEvent.getActionMasked() == 8) {
                    jA2 = X.a(motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9));
                } else {
                    jA2 = kt2.b;
                }
                h93 h93Var2 = new h93(jValueAt, motionEvent.getEventTime(), jL, j, z6, i2, sparseBooleanArray.get(motionEvent.getPointerId(i4), false), arrayList, jA2);
                ArrayList arrayList4 = arrayList2;
                arrayList4.add(h93Var2);
                i4++;
                arrayList2 = arrayList4;
                actionIndex2 = i6;
                z4 = z4;
                j2 = 1;
            }
            jL = jA;
            j = jO;
            toolType = motionEvent.getToolType(i4);
            if (toolType == 0) {
                if (toolType != 1) {
                    i2 = 1;
                } else if (toolType != 2) {
                    i2 = 3;
                } else if (toolType != 3) {
                    i2 = 2;
                } else if (toolType != 4) {
                    i2 = 4;
                }
                arrayList = new ArrayList();
                i3 = 0;
                while (i3 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i4, i3);
                    historicalY = motionEvent.getHistoricalY(i4, i3);
                    if (Float.isInfinite(historicalX)) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (Float.isInfinite(historicalY)) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            arrayList.add(new bd1(motionEvent.getHistoricalEventTime(i3), X.a(historicalX, historicalY)));
                        }
                    }
                    i3++;
                    actionIndex2 = actionIndex2;
                }
                int i7 = actionIndex2;
                if (motionEvent.getActionMasked() == 8) {
                    jA2 = X.a(motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9));
                } else {
                    jA2 = kt2.b;
                }
                h93 h93Var3 = new h93(jValueAt, motionEvent.getEventTime(), jL, j, z6, i2, sparseBooleanArray.get(motionEvent.getPointerId(i4), false), arrayList, jA2);
                ArrayList arrayList5 = arrayList2;
                arrayList5.add(h93Var3);
                i4++;
                arrayList2 = arrayList5;
                actionIndex2 = i7;
                z4 = z4;
                j2 = 1;
            }
            i2 = 0;
            arrayList = new ArrayList();
            i3 = 0;
            while (i3 < historySize) {
                historicalX = motionEvent.getHistoricalX(i4, i3);
                historicalY = motionEvent.getHistoricalY(i4, i3);
                if (Float.isInfinite(historicalX)) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (Float.isInfinite(historicalY)) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        arrayList.add(new bd1(motionEvent.getHistoricalEventTime(i3), X.a(historicalX, historicalY)));
                    }
                }
                i3++;
                actionIndex2 = actionIndex2;
            }
            int i8 = actionIndex2;
            if (motionEvent.getActionMasked() == 8) {
                jA2 = X.a(motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9));
            } else {
                jA2 = kt2.b;
            }
            h93 h93Var4 = new h93(jValueAt, motionEvent.getEventTime(), jL, j, z6, i2, sparseBooleanArray.get(motionEvent.getPointerId(i4), false), arrayList, jA2);
            ArrayList arrayList6 = arrayList2;
            arrayList6.add(h93Var4);
            i4++;
            arrayList2 = arrayList6;
            actionIndex2 = i8;
            z4 = z4;
            j2 = 1;
        }
        ArrayList arrayList7 = arrayList2;
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i9 = 0;
                while (true) {
                    if (i9 >= pointerCount2) {
                        z = false;
                        break;
                    }
                    if (motionEvent.getPointerId(i9) == iKeyAt) {
                        z = true;
                        break;
                    }
                    i9++;
                }
                if (!z) {
                    sparseLongArray.removeAt(size);
                    sparseBooleanArray.delete(iKeyAt);
                }
            }
        }
        motionEvent.getEventTime();
        return new g93(arrayList7, motionEvent);
    }
}
