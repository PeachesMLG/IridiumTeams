package com.iridium.iridiumteams.configs;

public class Messages {
    public String reloaded;
    public String noPermission;
    public String mustBeAPlayer;
    public String notAPlayer;
    public String unknownCommand;
    public String helpCommandHeader;
    public String helpCommandFiller;
    public String helpCommandMessage;
    public String helpCommandFooter;
    public String helpCommandPreviousPage;
    public String helpCommandNextPage;
    public String helpCommandNextPageHover;
    public String helpCommandPreviousPageHover;
    public String alreadyHaveTeam;
    public String teamNameAlreadyExists;
    public String teamNameTooShort;
    public String teamNameTooLong;
    public String teamCreated;
    public String teamDeleted;
    public String deletedPlayerTeam;
    public String dontHaveTeam;
    public String cannotChangePermissions;
    public String cannotInvite;
    public String cannotKick;
    public String cannotDeleteTeam;
    public String cannotChangeDescription;
    public String cannotChangeName;
    public String cannotSetHome;
    public String cannotManageWarps;
    public String invalidUserRank;
    public String invalidPermission;
    public String permissionSet;
    public String invalidSetting;
    public String invalidSettingValue;
    public String settingSet;
    public String userNotInYourTeam;
    public String cannotPromoteUser;
    public String cannotDemoteUser;
    public String cannotBreakBlocks;
    public String cannotPlaceBlocks;
    public String promotedPlayer;
    public String userPromotedPlayer;
    public String demotedPlayer;
    public String userDemotedPlayer;
    public String userAlreadyInTeam;
    public String inviteAlreadyPresent;
    public String teamInviteSent;
    public String teamInviteReceived;
    public String dontHaveInvite;
    public String noActiveInvite;
    public String teamInviteRevoked;
    public String youHaveBeenKicked;
    public String playerKicked;
    public String cannotKickHigherRank;
    public String cannotKickYourself;
    public String leftTeam;
    public String ownerCannotLeave;
    public String userLeftTeam;
    public String teamDoesntExistByName;
    public String changedPlayerDescription;
    public String descriptionChanged;
    public String changedPlayerName;
    public String nameChanged;
    public String notInTeamLand;
    public String homeSet;
    public String teleportingHome;
    public String homeNotSet;
    public String homeNotInTeam;
    public String nowBypassing;
    public String noLongerBypassing;
    public String mustBeOwnerToTransfer;
    public String cannotTransferToYourself;
    public String ownershipTransferred;
    public String joinedTeam;
    public String userJoinedTeam;
    public String bankWithdrew;
    public String bankDeposited;
    public String gaveBank;
    public String setBank;
    public String removedBank;
    public String gaveExperience;
    public String setExperience;
    public String removedExperience;
    public String insufficientFundsToWithdraw;
    public String insufficientFundsToDeposit;
    public String noSuchBankItem;
    public String notANumber;
    public String chatFormat;
    public String unknownChatType;
    public String setChatType;
    public String flightEnabled;
    public String flightDisabled;
    public String flightNotActive;
    public String noSuchBooster;
    public String noSuchUpgrade;
    public String notHighEnoughLevel;
    public String notEnoughMoney;
    public String notEnoughBankItem;
    public String purchasedUpgrade;
    public String purchasedBooster;
    public String calculatingTeams;
    public String calculatingFinished;
    public String calculationAlreadyInProcess;
    public String createdWarp;
    public String deletedWarp;
    public String warpAlreadyExists;
    public String warpLimitReached;
    public String memberLimitReached;
    public String unknownWarp;
    public String incorrectPassword;
    public String teleportingWarp;
    public String notSafe;
    public String warpIconSet;
    public String warpDescriptionSet;
    public String noSuchMaterial;
    public String noShopCategory;
    public String inventoryFull;
    public String noSuchItem;
    public String successfullyBought;
    public String successfullySold;
    public String cannotAfford;
    public Messages() {
        this("Team", "t", "IridiumTeams", "&c");
    }

    public Messages(String team, String command, String pluginName, String color) {
        reloaded = "%prefix% &7Configuration has been reloaded.";
        noPermission = "%prefix% &7You don't have permission for that.";
        mustBeAPlayer = "%prefix% &7You must be a player to execute this command.";
        notAPlayer = "%prefix% &7That player doesn't exist.";
        unknownCommand = "%prefix% &7Unknown Command, Try /" + command + " help.";
        helpCommandHeader = "&8[" + color + "&l" + pluginName + " Help&8]";
        helpCommandFiller = "&8&m ";
        helpCommandMessage = color + "/" + command + " %command%&r: &7%description%";
        helpCommandFooter = " &7Page %page% of %max_page% ";
        helpCommandPreviousPage = color + "<<";
        helpCommandNextPage = color + ">>";
        helpCommandNextPageHover = "&7Click to go to the next page.";
        helpCommandPreviousPageHover = "&7Click to go to the previous page.";
        alreadyHaveTeam = "%prefix% &7You already have a " + team;
        teamNameAlreadyExists = "%prefix% &7A " + team + " by that name already exists";
        teamNameTooShort = "%prefix% &7This " + team + " name is too short. It must be at least %min_length% characters long.";
        teamNameTooLong = "%prefix% &7This " + team + " name is too long. It must be at most %max_length% characters long.";
        teamCreated = "%prefix% &7You have created a " + team + "!";
        deletedPlayerTeam = "%prefix% &7You have deleted The " + team + " %name%!";
        teamDeleted = "%prefix% &7%player% has deleted your " + team + "!";
        dontHaveTeam = "%prefix% &7You dont have a " + team + ".";
        cannotChangePermissions = "%prefix% &7You cannot change this permission.";
        cannotInvite = "%prefix% &7You cannot invite players to the " + team + ".";
        cannotKick = "%prefix% &7You cannot kick players from the " + team + ".";
        cannotDeleteTeam = "%prefix% &7Only the " + team + " owner can delete the " + team + ".";
        cannotChangeDescription = "%prefix% &7You cannot change the " + team + "'s Description.";
        cannotChangeName = "%prefix% &7You cannot change the " + team + "'s Name.";
        cannotSetHome = "%prefix% &7You cannot change the " + team + "'s Home.";
        cannotManageWarps = "%prefix% &7You cannot manage the " + team + "'s Warps.";
        invalidUserRank = "%prefix% &7User rank doesn't exist.";
        invalidPermission = "%prefix% &7Permission doesn't exist.";
        permissionSet = "%prefix% &7%permission% permission set to %allowed% for %rank%'s.";
        invalidSetting = "%prefix% &7Setting doesn't exist.";
        invalidSettingValue = "%prefix% &7Setting Value doesn't exist.";
        settingSet = "%prefix% &7%setting% set to %value%.";
        userNotInYourTeam = "%prefix% &7That user is not in your " + team + ".";
        cannotPromoteUser = "%prefix% &7You cannot promote this User";
        cannotDemoteUser = "%prefix% &7You cannot demote this User";
        cannotBreakBlocks = "%prefix% &7You cannot break blocks in this " + team + ".";
        cannotPlaceBlocks = "%prefix% &7You cannot place blocks in this " + team + ".";
        promotedPlayer = "%prefix% &7You have promoted %player% to %rank%.";
        userPromotedPlayer = "%prefix% &7%promoter% has promoted %player% to %rank%.";
        demotedPlayer = "%prefix% &7You have demoted %player% to %rank%.";
        userDemotedPlayer = "%prefix% &7%demoter% has demoted %player% to %rank%.";
        userAlreadyInTeam = "%prefix% &7That user is already a member of your " + team + "";
        inviteAlreadyPresent = "%prefix% &7There is already an active invite for that user.";
        teamInviteSent = "%prefix% &7You have sent a " + team + " invite to %player%.";
        teamInviteReceived = "%prefix% &7You have received a " + team + " invite from %player%.";
        dontHaveInvite = "%prefix% &7You dont have an active invite for that " + team + ".";
        noActiveInvite = "%prefix% &7There is no active invite for that user.";
        teamInviteRevoked = "%prefix% &7You have revoked a " + team + " invite from %player%.";
        youHaveBeenKicked = "%prefix% &7You have been kicked from your " + team + " by %player%";
        playerKicked = "%prefix% &7%player% has been kicked from your " + team + " by %kicker%";
        cannotKickHigherRank = "%prefix% &7You cannot kick someone with a higher rank than you.";
        cannotKickYourself = "%prefix% &7You cannot kick yourself.";
        leftTeam = "%prefix% &7You have left the " + team + " %name%.";
        ownerCannotLeave = "%prefix% &7You cannot leave your " + team + " try /" + command + " delete.";
        userLeftTeam = "%prefix% &7%player% has left your " + team + ".";
        teamDoesntExistByName = "%prefix% &7No " + team + " by that name exists.";
        changedPlayerDescription = "%prefix% &7You changed %name%'s description to to %description%.";
        descriptionChanged = "%prefix% &7%player% has changed your " + team + "'s description to %description%.";
        changedPlayerName = "%prefix% &7You changed %player%'s " + team + "'s name to to %name%.";
        nameChanged = "%prefix% &7%player% has changed your " + team + "'s name to %name%.";
        notInTeamLand = "%prefix% &7You must be inside your " + team + "'s land to do this.";
        homeSet = "%prefix% &7%player% has set " + team + "'s home.";
        teleportingHome = "%prefix% &7Teleporting to your " + team + " home.";
        homeNotSet = "%prefix% &7Your " + team + " home is not set.";
        homeNotInTeam = "%prefix% &7Your " + team + " home is not inside your claim.";
        nowBypassing = "%prefix% &7You are now bypassing " + team + " restrictions.";
        noLongerBypassing = "%prefix% &7You are no longer bypassing " + team + " restrictions.";
        mustBeOwnerToTransfer = "%prefix% &7You must be the " + team + " owner to transfer ownership";
        cannotTransferToYourself = "%prefix% &7You cannot transfer " + team + " ownership to yourself.";
        ownershipTransferred = "%prefix% &7%old_owner% has transferred " + team + " ownership to %new_owner%.";
        joinedTeam = "%prefix% &7You have joined the " + team + " %name%.";
        userJoinedTeam = "%prefix% &7%player% has joined your " + team + ".";
        bankWithdrew = "%prefix% &7You successfully withdrew %amount% %type% from your " + team + " bank.";
        bankDeposited = "%prefix% &7You successfully deposited %amount% %type% from your " + team + " bank.";
        gaveBank = "%prefix% &7You gave %player% %amount% %item%.";
        setBank = "%prefix% &7You set %player%'s %amount% to %item%.";
        removedExperience = "%prefix% &7You took %amount% "+team+" experience from %player%.";
        gaveExperience = "%prefix% &7You gave %amount% "+team+" experience to %player%.";
        setExperience = "%prefix% &7You set %player%'s "+team+" experience to %amount%.";
        removedBank = "%prefix% &7You took %amount% %item%'s from %player%.";
        insufficientFundsToWithdraw = "%prefix% &7You do not have enough %type% to withdraw from your " + team + " bank.";
        insufficientFundsToDeposit = "%prefix% &7You do not have enough %type% to deposit into your " + team + " bank.";
        noSuchBankItem = "%prefix% &7That bank item doesn't exist.";
        notANumber = "%prefix% &7That is not a valid number.";
        chatFormat = "%player% &7: &7%message%";
        unknownChatType = "%prefix% &7Unknown " + team + " Chat Type %type%";
        setChatType = "%prefix% &7You have set your " + team + " Chat Type to %type%";
        flightEnabled = "%prefix% &7" + team + " flight enabled.";
        flightDisabled = "%prefix% &7" + team + " flight disabled.";
        flightNotActive = "%prefix% &7The flight booster is not currently active.";
        noSuchBooster = "%prefix% &7No booster by that name exists.";
        noSuchUpgrade = "%prefix% &7No Upgrade by that name exists.";
        notHighEnoughLevel = "%prefix% &7You need to be atleast level %level% in your " + team + ".";
        notEnoughMoney = "%prefix% &7You dont have enough money to purchase this.";
        notEnoughBankItem = "%prefix% &7You dont have enough %bank% in your " + team + " Bank.";
        purchasedBooster = "%prefix% &7You have purchased a %booster% booster";
        purchasedUpgrade = "%prefix% &7You have purchased a %upgrade% upgrade";
        calculatingTeams = "%prefix% &7%player% is recalculating value for %amount% " + team + "'s \n%prefix% &7Estimated time: %minutes% Minutes and %seconds% Seconds";
        calculatingFinished = "%prefix% &7Recalculating " + team + "'s completed!";
        calculationAlreadyInProcess = "%prefix% &7Recalculating " + team + "'s already in process.";
        createdWarp = "%prefix% &7Created warp %name%.";
        deletedWarp = "%prefix% &7%player% has deleted the warp %name%.";
        warpAlreadyExists = "%prefix% &7A warp with that name already exists.";
        warpLimitReached = "%prefix% &7" + team + " Warp limit has been reached.";
        memberLimitReached = "%prefix% &7" + team + " Member limit has been reached.";
        unknownWarp = "%prefix% &7No warp exists by that name.";
        incorrectPassword = "%prefix% &7Incorrect password.";
        teleportingWarp = "%prefix% &7teleporting to warp %name%.";
        notSafe = "%prefix% &7This location is not safe.";
        warpIconSet = "%prefix% &7warp icon set.";
        warpDescriptionSet = "%prefix% &7warp description set.";
        noSuchMaterial = "%prefix% &7Material doesn't exist.";
        noShopCategory = "%prefix% &7There is no category with this name.";
        inventoryFull = "%prefix% &7Your inventory is full!";
        noSuchItem = "%prefix% &7You don't have this item!";
        successfullyBought = "%prefix% &7You have successfully bought %amount%x %item% &7for $%vault_cost%.";
        successfullySold = "%prefix% &7You have successfully sold %amount%x %item% &7for $%vault_reward%.";
        cannotAfford = "%prefix% &7You cannot afford this.";
    }
}
