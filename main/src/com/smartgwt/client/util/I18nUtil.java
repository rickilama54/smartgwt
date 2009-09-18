/*
 * SmartGWT (GWT for SmartClient)
 * Copyright 2008 and beyond, Isomorphic Software, Inc.
 *
 * SmartGWT is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.  SmartGWT is also
 * available under typical commercial license terms - see
 * http://smartclient.com/license
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

package com.smartgwt.client.util;

import com.smartgwt.client.i18n.SmartGwtMessages;
import com.google.gwt.core.client.GWT;

public class I18nUtil {

    private static boolean initialized = false;

    /**
     * Setup SmartGWT i18n.
     */
    public static void init() {
        if(!initialized) {
            initialized = true;
            SmartGwtMessages messages = GWT.create(SmartGwtMessages.class);
            doInit(messages);
        }
    }

    private static native void doInit(SmartGwtMessages messages) /*-{

        if($wnd.isc.Dialog) {
            $wnd.isc.Dialog.addClassProperties({OK_BUTTON_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_OkButtonTitle()()});
            $wnd.isc.Dialog.addClassProperties({APPLY_BUTTON_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_ApplyButtonTitle()()});
            $wnd.isc.Dialog.addClassProperties({YES_BUTTON_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_YesButtonTitle()()});
            $wnd.isc.Dialog.addClassProperties({NO_BUTTON_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_NoButtonTitle()()});
            $wnd.isc.Dialog.addClassProperties({CANCEL_BUTTON_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_CancelButtonTitle()()});
            $wnd.isc.Dialog.addClassProperties({CONFIRM_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_ConfirmTitle()()});
            $wnd.isc.Dialog.addClassProperties({SAY_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_SayTitle()()});
            $wnd.isc.Dialog.addClassProperties({WARN_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_WarnTitle()()});
            $wnd.isc.Dialog.addClassProperties({ASK_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_AskTitle()()});
            $wnd.isc.Dialog.addClassProperties({ASK_FOR_VALUE_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_AskForValueTitle()()});
            $wnd.isc.Dialog.addClassProperties({LOGIN_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_LoginTitle()()});
            $wnd.isc.Dialog.addClassProperties({USERNAME_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_UserNameTitle()()});
            $wnd.isc.Dialog.addClassProperties({PASSWORD_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_PasswordTitle()()});
            $wnd.isc.Dialog.addClassProperties({LOGIN_BUTTON_TITLE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_LoginButtonTitle()()});
            $wnd.isc.Dialog.addClassProperties({LOGIN_ERROR_MESSAGE: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dialog_LoginErrorMessage()()});
        }

        if($wnd.isc.RPCManager) {
            $wnd.isc.RPCManager.addClassProperties({defaultPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::rpcManager_defaultPrompt()()});
            $wnd.isc.RPCManager.addClassProperties({timeoutErrorMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::rpcManager_timeoutErrorMessage()()});
            $wnd.isc.RPCManager.addClassProperties({removeDataPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::rpcManager_removeDataPrompt()()});
            $wnd.isc.RPCManager.addClassProperties({saveDataPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::rpcManager_saveDataPrompt()()});
            $wnd.isc.RPCManager.addClassProperties({fetchDataPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::rpcManager_fetchDataPrompt()()});
        }

        if($wnd.isc.Operators){
            $wnd.isc.Operators.addClassProperties({equalsTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_equalsTitle()()});
            $wnd.isc.Operators.addClassProperties({notEqualTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_notEqualTitle()()});
            $wnd.isc.Operators.addClassProperties({greaterThanTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_greaterThanTitle()()});
            $wnd.isc.Operators.addClassProperties({lessThanTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_lessThanTitle()()});
            $wnd.isc.Operators.addClassProperties({betweenTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_betweenTitle()()});
            $wnd.isc.Operators.addClassProperties({greaterOrEqualTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_greaterOrEqualTitle()()});
            $wnd.isc.Operators.addClassProperties({lessOrEqualTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_lessOrEqualTitle()()});
            $wnd.isc.Operators.addClassProperties({betweenTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_betweenTitle()()});
            $wnd.isc.Operators.addClassProperties({lessThanTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_lessThanTitle()()});
            $wnd.isc.Operators.addClassProperties({betweenTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_betweenTitle()()});
            $wnd.isc.Operators.addClassProperties({betweenInclusiveTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_betweenInclusiveTitle()()});
            $wnd.isc.Operators.addClassProperties({iContainsTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_iContainsTitle()()});
            $wnd.isc.Operators.addClassProperties({iStartsWithTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_iStartsWithTitle()()});
            $wnd.isc.Operators.addClassProperties({iEndsWithTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_iEndsWithTitle()()});
            $wnd.isc.Operators.addClassProperties({containsTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_containsTitle()()});
            $wnd.isc.Operators.addClassProperties({startsWithTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_startsWithTitle()()});
            $wnd.isc.Operators.addClassProperties({endsWithTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_endsWithTitle()()});
            $wnd.isc.Operators.addClassProperties({iNotContainsTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_iNotContainsTitle()()});
            $wnd.isc.Operators.addClassProperties({iNotStartsWithTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_iNotStartsWithTitle()()});
            $wnd.isc.Operators.addClassProperties({iNotEndsWithTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_iNotEndsWithTitle()()});
            $wnd.isc.Operators.addClassProperties({notContainsTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_notContainsTitle()()});
            $wnd.isc.Operators.addClassProperties({notStartsWithTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_notStartsWithTitle()()});
            $wnd.isc.Operators.addClassProperties({notEndsWithTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_notEndsWithTitle()()});
            $wnd.isc.Operators.addClassProperties({isNullTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_isNullTitle()()});
            $wnd.isc.Operators.addClassProperties({notNullTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_notNullTitle()()});
            $wnd.isc.Operators.addClassProperties({regexpTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_regexpTitle()()});
            $wnd.isc.Operators.addClassProperties({iregexpTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_iregexpTitle()()});
            $wnd.isc.Operators.addClassProperties({inSetTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_inSetTitle()()});
            $wnd.isc.Operators.addClassProperties({notInSetTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_notInSetTitle()()});
            $wnd.isc.Operators.addClassProperties({equalsFieldTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_equalsFieldTitle()()});
            $wnd.isc.Operators.addClassProperties({notEqualFieldTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_notEqualFieldTitle()()});
            $wnd.isc.Operators.addClassProperties({andTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_andTitle()()});
            $wnd.isc.Operators.addClassProperties({notTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_notTitle()()});
            $wnd.isc.Operators.addClassProperties({orTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::operators_orTitle()()});
        }

        if($wnd.isc.GroupingMessages) {
            $wnd.isc.GroupingMessages.addClassProperties({upcomingTodayTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_upcomingTodayTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({upcomingTomorrowTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_upcomingTomorrowTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({upcomingThisWeekTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_upcomingThisWeekTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({upcomingNextWeekTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_upcomingNextWeekTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({upcomingNextMonthTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_upcomingNextMonthTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({upcomingBeforeTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_upcomingBeforeTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({upcomingLaterTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_upcomingLaterTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byDayTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byDayTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byWeekTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byWeekTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byMonthTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byMonthTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byQuarterTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byQuarterTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byYearTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byYearTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byDayOfMonthTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byDayOfMonthTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byUpcomingTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byUpcomingTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byHoursTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byHoursTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byMinutesTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byMinutesTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({bySecondsTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_bySecondsTitle()()});
            $wnd.isc.GroupingMessages.addClassProperties({byMillisecondsTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::grouping_byMillisecondsTitle()()});
        }

        if($wnd.isc.Validator) {
            $wnd.isc.Validator.addClassProperties({notABoolean: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_notABoolean()()});
            $wnd.isc.Validator.addClassProperties({notAString: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_notAString()()});
            $wnd.isc.Validator.addClassProperties({notAnInteger: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_notAnInteger()()});
            $wnd.isc.Validator.addClassProperties({notADecimal: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_notADecimal()()});
            $wnd.isc.Validator.addClassProperties({notADate: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_notADate()()});
            $wnd.isc.Validator.addClassProperties({mustBeLessThan: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_mustBeLessThan()() + ' ${max}'});
            $wnd.isc.Validator.addClassProperties({mustBeGreaterThan: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_mustBeGreaterThan()() + ' ${min}'});
            $wnd.isc.Validator.addClassProperties({mustBeLaterThan: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_mustBeLaterThan()() + ' ${min.toShortDate()}'});
            $wnd.isc.Validator.addClassProperties({mustBeEarlierThan: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_mustBeEarlierThan()() + ' ${max.toShortDate()}'});
            $wnd.isc.Validator.addClassProperties({mustBeShorterThan: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_mustBeShorterThan()()});
            $wnd.isc.Validator.addClassProperties({mustBeLongerThan: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_mustBeLongerThan()()});
            $wnd.isc.Validator.addClassProperties({mustBeExactLength: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_mustBeExactLength()()});
            $wnd.isc.Validator.addClassProperties({requiredField: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_requiredField()()});
            $wnd.isc.Validator.addClassProperties({notOneOf: messages.@com.smartgwt.client.i18n.SmartGwtMessages::validator_notOneOf()()});
        }

        if($wnd.isc.Time) {
            $wnd.isc.Time.addClassProperties({AMIndicator: messages.@com.smartgwt.client.i18n.SmartGwtMessages::time_AMIndicator()()});
            $wnd.isc.Time.addClassProperties({PMIndicator: messages.@com.smartgwt.client.i18n.SmartGwtMessages::time_PMIndicator()()});
        }

        if($wnd.isc.Window) {
            $wnd.isc.Window.addClassProperties({title: messages.@com.smartgwt.client.i18n.SmartGwtMessages::window_title()()});
        }

        if($wnd.isc.DateChooser) {
            $wnd.isc.DateChooser.addProperties({todayButtonTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dateChooser_todayButtonTitle()()});
            $wnd.isc.DateChooser.addProperties({cancelButtonTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dateChooser_cancelButtonTitle()()});
        }

        if($wnd.isc.DynamicForm) {
            $wnd.isc.DynamicForm.addProperties({errorsPreamble: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dynamicForm_errorsPreamble()()});
            $wnd.isc.DynamicForm.addProperties({unknownErrorMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dynamicForm_unknownErrorMessage()()});
            $wnd.isc.ValuesManager.addProperties({unknownErrorMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::valuesManager_unknownErrorMessage()()});
        }

        if($wnd.isc.SelectItem) {
            $wnd.isc.SelectItem.addProperties({otherTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::selectOtherItem_otherTitle()()});
            $wnd.isc.SelectItem.addProperties({selectOtherPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::selectOtherItem_selectOtherPrompt()()});
        }

        if($wnd.isc.DateItem) {
            $wnd.isc.DateItem.addProperties({invalidDateStringMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dateItem_invalidDateStringMessage()()});
            $wnd.isc.DateItem.addProperties({pickerIconPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dateItem_pickerIconPrompt()()});
        }

        if($wnd.isc.Selection) {
            $wnd.isc.Selection.addProperties({selectionRangeNotLoadedMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::selection_selectionRangeNotLoadedMessage()()});
        }

        if($wnd.isc.ListGrid) {
            $wnd.isc.ListGrid.addProperties({emptyMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_emptyMessage()()});
            $wnd.isc.ListGrid.addProperties({loadingDataMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_loadingDataMessage()()});
            $wnd.isc.ListGrid.addProperties({cancelEditingConfirmationMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_cancelEditingConfirmationMessage()()});
            $wnd.isc.ListGrid.addProperties({confirmDiscardEditsMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_confirmDiscardEditsMessage()()});
            $wnd.isc.ListGrid.addProperties({discardEditsSaveButtonTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_discardEditsSaveButtonTitle()()});
            $wnd.isc.ListGrid.addProperties({freezeOnRightText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_freezeOnRightText()()});
            $wnd.isc.ListGrid.addProperties({freezeOnLeftText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_freezeOnLeftText()()});
            $wnd.isc.ListGrid.addProperties({sortFieldAscendingText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_sortFieldAscendingText()()});
            $wnd.isc.ListGrid.addProperties({sortFieldDescendingText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_sortFieldDescendingText()()});
            $wnd.isc.ListGrid.addProperties({fieldVisibilitySubmenuTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_fieldVisibilitySubmenuTitle()()});
            $wnd.isc.ListGrid.addProperties({freezeFieldText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_freezeFieldText()() + ' ${viewer.getSummaryTitle(field)}'});
            $wnd.isc.ListGrid.addProperties({unfreezeFieldText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_unfreezeFieldText()() + ' ${viewer.getSummaryTitle(field)}'});
            $wnd.isc.ListGrid.addProperties({groupByText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_groupByText()() + ' ${title}'});
            $wnd.isc.ListGrid.addProperties({ungroupText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::listGrid_ungroupText()()});
        }

        $wnd.isc.Canvas.addProperties({addFormulaFieldText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dataBoundComponent_addFormulaFieldText()()});
        $wnd.isc.Canvas.addProperties({editFormulaFieldText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dataBoundComponent_editFormulaFieldText()()});
        $wnd.isc.Canvas.addProperties({addSummaryFieldText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dataBoundComponent_addSummaryFieldText()()});
        $wnd.isc.Canvas.addProperties({editSummaryFieldText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dataBoundComponent_editSummaryFieldText()()});
        $wnd.isc.Canvas.addProperties({requiredFieldMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::dataBoundComponent_requiredFieldMessage()()});

        if($wnd.isc.TreeGrid) {
            $wnd.isc.TreeGrid.addProperties({parentAlreadyContainsChildMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::treeGrid_parentAlreadyContainsChildMessage()()});
            $wnd.isc.TreeGrid.addProperties({cantDragIntoSelfMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::treeGrid_cantDragIntoSelfMessage()()});
            $wnd.isc.TreeGrid.addProperties({cantDragIntoChildMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::treeGrid_cantDragIntoChildMessage()()});
        }

        if($wnd.isc.FormulaBuilder) {
            $wnd.isc.FormulaBuilder.addProperties({instructionsTextStart: messages.@com.smartgwt.client.i18n.SmartGwtMessages::formulaBuilder_instructionsTextStart()() + ' '});
            $wnd.isc.FormulaBuilder.addProperties({samplePrompt: '<nobr>' + messages.@com.smartgwt.client.i18n.SmartGwtMessages::formulaBuilder_samplePromptForRecord()() + ' ${title}</nobr><br><nobr>' +
                                                                 messages.@com.smartgwt.client.i18n.SmartGwtMessages::formulaBuilder_samplePromptOutput()() + ' ${output}</nobr>'
            });
        }

        if($wnd.isc.PrintWindow) {
            $wnd.isc.PrintWindow.addProperties({printButtonTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::printWindow_printButtonTitle()()});
            $wnd.isc.PrintWindow.addProperties({title: messages.@com.smartgwt.client.i18n.SmartGwtMessages::printWindow_title()()});
        }

        if($wnd.isc.PickTreeItem) $wnd.isc.PickTreeItem.addProperties({emptyMenuMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::pickTreeItem_emptyMenuMessage()()});

        if($wnd.isc.MenuButton) $wnd.isc.MenuButton.addProperties({title: messages.@com.smartgwt.client.i18n.SmartGwtMessages::menuButton_title()()});

        if($wnd.isc.Calendar) {
            $wnd.isc.Calendar.addProperties({invalidDateMessage: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_invalidDateMessage()()});
            $wnd.isc.Calendar.addProperties({addEventButtonHoverText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_addEventButtonHoverText()()});
            $wnd.isc.Calendar.addProperties({cancelButtonTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_cancelButtonTitle()()});
            $wnd.isc.Calendar.addProperties({datePickerHoverText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_datePickerHoverText()()});
            $wnd.isc.Calendar.addProperties({dayViewTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_dayViewTitle()()});
            $wnd.isc.Calendar.addProperties({detailsButtonTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_detailsButtonTitle()()});
            $wnd.isc.Calendar.addProperties({eventNameFieldTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_eventNameFieldTitle()()});
            $wnd.isc.Calendar.addProperties({monthViewTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_monthViewTitle()()});
            $wnd.isc.Calendar.addProperties({nextButtonHoverText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_nextButtonHoverText()()});
            $wnd.isc.Calendar.addProperties({previousButtonHoverText: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_previousButtonHoverText()()});
            $wnd.isc.Calendar.addProperties({saveButtonTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_saveButtonTitle()()});
            $wnd.isc.Calendar.addProperties({timelineViewTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_timelineViewTitle()()});
            $wnd.isc.Calendar.addProperties({weekViewTitle: messages.@com.smartgwt.client.i18n.SmartGwtMessages::calendar_weekViewTitle()()});
        }

        if($wnd.isc.FilterBuilder) {
            $wnd.isc.FilterBuilder.addProperties({addButtonPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::filterBuilder_addButtonPrompt()()});
            $wnd.isc.FilterBuilder.addProperties({rangeSeparator: messages.@com.smartgwt.client.i18n.SmartGwtMessages::filterBuilder_rangeSeparator()()});
            $wnd.isc.FilterBuilder.addProperties({removeButtonPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::filterBuilder_removeButtonPrompt()()});
            $wnd.isc.FilterBuilder.addProperties({subClauseButtonPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::filterBuilder_subClauseButtonPrompt()()});
            $wnd.isc.FilterBuilder.addProperties({subClauseButtonPrompt: messages.@com.smartgwt.client.i18n.SmartGwtMessages::filterBuilder_subClauseButtonPrompt()()});
        }
        $wnd.isc.addProperties($wnd.Date, {shortDayNames: [
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortDayNames_1()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortDayNames_2()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortDayNames_3()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortDayNames_4()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortDayNames_5()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortDayNames_6()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortDayNames_7()()]
        });

        $wnd.isc.addProperties($wnd.Date, {shortMonthNames: [
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_1()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_2()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_3()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_4()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_5()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_6()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_7()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_8()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_9()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_10()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_11()(),
            messages.@com.smartgwt.client.i18n.SmartGwtMessages::date_shortMonthNames_12()()]
        });

}-*/;


}
